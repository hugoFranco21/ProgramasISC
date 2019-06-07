/*
 * sorts.h
 *
 *  Created on: 05/08/2015
 *      Author: pperezm
 *
 *	Modified by:
 *		Hugo David Franco Avila
 *	Date: 21-Sep-2018
 *
 */

#ifndef SORTS_H_
#define SORTS_H_

#include "exception.h"
#include <vector>
#include <list>

template <class T>
class Sorts {
private:
	void swap(std::vector<T>&, int, int);
	void copyArray(std::vector<T>&, std::vector<T>&, int, int);
	void mergeArray(std::vector<T>&, std::vector<T>&, int, int, int);
	void mergeSplit(std::vector<T>&, std::vector<T>&, int, int);
public:
	std::vector<T> bubbleSort(const std::vector<T>&);
	std::vector<T> selectionSort(const std::vector<T>&);
	std::vector<T> insertionSort(const std::vector<T>&);
	std::vector<T> shellSort(const std::vector<T>&);
	std::vector<T> mergeSort(const std::vector<T>&);

	std::vector<T> bucketSort(const std::vector<T>&);
	std::list<T>   mergeList(const std::list<T>&, const std::list<T>&);
};

template <class T>
void Sorts<T>::swap(std::vector<T> &v, int i, int j) {
	T aux = v[i];
	v[i] = v[j];
	v[j] = aux;
}

template <class T>
std::vector<T> Sorts<T>::bubbleSort(const std::vector<T> &source) {
	std::vector<T> v(source);

	for (int i = v.size() - 1; i > 0; i--) {
		for (int j = 0; j < i; j++) {
			if (v[j] > v[j + 1]) {
				swap(v, j, j + 1);
			}
		}
	}
	return v;
}

template <class T>
std::vector<T> Sorts<T>::selectionSort(const std::vector<T> &source) {
	std::vector<T> v(source);
	int pos;

	for (int i = v.size() - 1; i > 0; i--) {
		pos = 0;
		for (int j = 1; j <= i; j++) {
			if (v[j] > v[pos]) {
				pos = j;
			}
		}

		if (pos != i) {
			swap(v, i, pos);
		}
	}
	return v;
}

template <class T>
std::vector<T> Sorts<T>::insertionSort(const std::vector<T> &source) {
	std::vector<T> v(source);

	for (int i = 1; i < v.size(); i++) {
		for (int j = i; j > 0 && v[j] < v[j - 1]; j--) {
			swap(v, j, j - 1);
		}
	}
	return v;
}

template <class T>
std::vector<T> Sorts<T>::shellSort(const std::vector<T> &source) {
	std::vector<T> v(source);
	int gap = v.size() / 2;

	while (gap > 0) {
		for (int i = gap; i < v.size(); i++) {
			for (int j = i; j >= gap && v[j] < v[j - gap]; j -= gap) {
				swap(v, j, j - gap);
			}
		}
		gap /= 2;
	}
	return v;
}

template <class T>
void Sorts<T>::copyArray(std::vector<T> &A, std::vector<T> &B, int low, int high) {
	for (int i = low; i <= high; i++) {
		A[i] = B[i];
	}
}

template <class T>
void Sorts<T>::mergeArray(std::vector<T> &A, std::vector<T> &B, int low, int mid, int high) {
	int i, j, k;

	i = low;
	j = mid + 1;
	k = low;

	while (i <= mid &&j <= high) {
		if (A[i] < A[j]) {
			B[k] = A[i];
			i++;
		} else {
			B[k] = A[j];
			j++;
		}
		k++;
	}
	if (i > mid) {
		for (; j <= high; j++) {
			B[k++] = A[j];
		}
	} else {
		for (; i <= mid; i++) {
			B[k++] = A[i];
		}
	}
}

template <class T>
std::vector<T> Sorts<T>::bucketSort(const std::vector<T> &source) {
	int i;
	std::list<T> listas[10];
	typename std::list<T> :: iterator it;
	std::vector<T> v;
	for(i = 0; i < source.size(); i++){
		listas[source[i]/10].push_back(source[i]);
	}
	for(i = 0; i < 10; i++){
		listas[i].sort();//ordena directamente cada lista
	}
	for(i = 0;i< 10; i++){
		for(it = listas[i].begin(); it != listas[i].end(); it++){
			v.push_back(*it);
		}
	}
	return v;
}

template <class T>
std::list<T> Sorts<T>::mergeList(const std::list<T> &lst1, const std::list<T> &lst2) {
	typename std::list<T>::const_iterator it1, it2;//iterador const porque las listas son const
	std::list<T> lista;
	bool tl1;//bandera para indicar si ya acabo el iterador de la lista 1
	it1 = lst1.begin();
	it2 = lst2.begin();
	while(it1 != lst1.end() && it2 != lst2.end()){//mientras los iteradores todavia encuentren elementos en ambas listas
		if(*it1 <= *it2){//compara elementos
			lista.push_back(*it1);
			it1++;
		} else{
			lista.push_back(*it2);
			it2++;
		}
	}
	if(it1 == lst1.end()){
		tl1 = true;//elementos de lista 1 ya estan en la lista de salida
	}
	if(tl1){
		//agrega elementos restantes lista 2
		while(it2 != lst2.end()){
			lista.push_back(*it2);
			it2++;
		}
	} else{
		//si la lista 1 todavia tiene elementos, los agrega
		while(it1 != lst1.end()){
			lista.push_back(*it1);
			it1++;
		}
	}
	return lista;
}

#endif /* SORTS_H_ */
