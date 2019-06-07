/*
 * sorts.h
 *
 *  Created on: 05/08/2015
 *      Author: pperezm
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
	return v;
}

template <class T>
std::vector<T> Sorts<T>::selectionSort(const std::vector<T> &source) {
	std::vector<T> v(source);
	return v;
}

template <class T>
std::vector<T> Sorts<T>::insertionSort(const std::vector<T> &source) {
	std::vector<T> v(source);
	return v;
}

template <class T>
std::vector<T> Sorts<T>::shellSort(const std::vector<T> &source) {
	std::vector<T> v(source);
	return v;
}

template <class T>
void Sorts<T>::copyArray(std::vector<T> &A, std::vector<T> &B, int low, int high) {
}

template <class T>
void Sorts<T>::mergeArray(std::vector<T> &A, std::vector<T> &B, int low, int mid, int high) {
}

template <class T>
void Sorts<T>::mergeSplit(std::vector<T> &A, std::vector<T> &B, int low, int high) {
}

template <class T>
std::vector<T> Sorts<T>::mergeSort(const std::vector<T> &source) {
	std::vector<T> v(source);
	std::vector<T> tmp(v.size());

	return v;
}

template <class T>
std::vector<T> Sorts<T>::bucketSort(const std::vector<T> &source) {
	    int sizeList = 10;
	std::list<T> myLists[sizeList];
	typename  std::list<T>::iterator itr;
	std::vector<T> v;

	int index;
	for (int i = 0; i<source.size(); i++){
        index = source[i]/10;
        myLists[index].push_back(source[i]);
    }
    for(int i = 0; i < sizeList; i++){
        myLists[i].sort();
    }
    for(int i = 0; i < 10; i++){
        for(itr = myLists[i].begin(); itr != myLists[i].end(); itr++){
            v.push_back(*itr);
        }
    }
	return v;
}

template <class T>
std::list<T> Sorts<T>::mergeList(const std::list<T> &lst1, const std::list<T> &lst2) {
	typename std::list<T>::const_iterator itr1, itr2;
	std::list<T> result;

	return result;
}

#endif /* SORTS_H_ */
