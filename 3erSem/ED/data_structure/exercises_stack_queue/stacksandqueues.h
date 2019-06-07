/*
 * saq.h
 *
 *  Created on: 10/08/2015
 *      Author: pperezm
 * 	Modified by:
 *		Hugo David Franco Avila
 *	Date: 14/10/18
 */

#ifndef STACKSANDQUEUES_H_
#define STACKSANDQUEUES_H_

#include <iostream>
#include <string>
#include <cctype>
#include <queue>
#include <stack>

using namespace std;

class StacksAndQueues {
private:
	queue<string> tokenize(string);
	bool hasHigherPrecedence(const string&, const string&);

public:
	bool balancedBrackets(const string&);
	queue<int> merge(const queue<int>&, const queue<int>&);
	string convertInfixToPostfix(const string&);
};

queue<string> StacksAndQueues::tokenize(string str) {
	int i = 0;
	int length = str.size();
	string aux;
	queue<string> result;

	while (i < length) {
		if (isdigit(str[i])) {
			aux.clear();
			do {
				aux += str[i];
				i++;
			} while(isdigit(str[i]));
			result.push(aux);
		} else if (isspace(str[i])) {
			i++;
		} else {
			aux.clear();
			aux += str[i];
			result.push(aux);
			i++;
		}
	}
	return result;
}

bool StacksAndQueues::hasHigherPrecedence(const string &stackTop, const string &op) {
	return !((stackTop == string("+") || stackTop == string("-")) &&
			 (op == string("*")       || op == string("/")));
}

bool StacksAndQueues::balancedBrackets(const string &expr) {
	//string::iterator it;
	stack<char> brack;
	for(int i = 0; i < expr.size(); i++){
		//cout << expr[i] << endl;
		if(expr[i] == '(' || expr[i] == '[' || expr[i] == '{'){
			brack.push(expr[i]);
		} else if(expr[i] == ')' || expr[i] == ']' || expr[i] == '}'){
			if(brack.empty()) return false;
			switch(expr[i]){
				case ')':
					if(brack.top() != '(') return false;
					brack.pop();
				break;
				case ']':
					//cout << "este caso" << endl;
					if(brack.top() != '[') return false;
					brack.pop();
				break;
				case '}':
					if(brack.top() != '{') return false;
					brack.pop();
				break;
			}
		}
	}
	if(brack.empty()){
		return true;
	} else{
		return false;
	}
}

queue<int> StacksAndQueues::merge(const queue<int> &queue1, const queue<int> &queue2) {
	queue<int> result, q1, q2;
	q1 = queue1;
	q2 = queue2;
	//bool flag;
	//queue::iterator t1, t2;
	//for(t1 = queue1.begin(), t2 = queue2.begin(); 
	while(!q1.empty() && !q2.empty()){
		if(q1.front() < q2.front()){
			result.push(q1.front());
			q1.pop();
		} else{
			result.push(q2.front());
			q2.pop();
		}
	}
	if(q1.empty()){
		while(!q2.empty()){
			result.push(q2.front());
			q2.pop();
		}
	} else{
		while(!q1.empty()){
			result.push(q1.front());
			q1.pop();
		}
	}
	return result;
}

string StacksAndQueues::convertInfixToPostfix(const string &expr) {
	stack<string> s;
	queue<string> result, aux;
	string ex;
	aux = tokenize(expr);
	while(!aux.empty()){
		if(aux.front()[0] > 47 && aux.front()[0] < 58){
			//cout << aux.front() << endl;
			result.push(aux.front());
			//a.push(aux.front());
			aux.pop();
		} else if(aux.front()[0] == '('){
			//cout << aux.front() << endl;
			s.push(aux.front());
			//cout << s.top() << endl;
			aux.pop();
		} else if(aux.front()[0] == ')'){
			//cout << aux.front() << endl;
			while(!s.empty() && s.top()[0] != '('){
				result.push(s.top());
				//a.push(s.top());
				s.pop();	
			}
			s.pop();
			aux.pop();
		} else{
			//cout << aux.front() << endl;
			while(!s.empty() && s.top()[0] != '('){
				if(hasHigherPrecedence(s.top(), aux.front())){
					result.push(s.top());
					//a.push(s.top());
					s.pop();
				} else{
					break;
				}
			}
			s.push(aux.front());
			aux.pop();
		}
		//if(!a.empty()) cout << "el stack empieza con " << a.top() << endl;
	}
	while(!s.empty()){
		result.push(s.top());
		s.pop();
	}
	while(!result.empty()){
		ex += result.front();
		result.pop();
		if(!result.empty()) ex += " ";
		//cout << ex << endl;
		//result.pop();
	}
	return ex;
}

#endif /* STACKSANDQUEUES_H_ */
