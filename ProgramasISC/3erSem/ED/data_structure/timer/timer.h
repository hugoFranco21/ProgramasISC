/*
 * timer.h
 *
 *  Created on: 05/08/2015
 *      Author: pperezm
 *  Modified by: 
 *		A01654856 Hugo David Franco Avila 
 *	Date: 
 *		26 - Aug - 18
 */

#ifndef TIMER_H_
#define TIMER_H_

#include <string>
#include <sstream>

class Timer {
private:
	int hours, minutes;

public:
	Timer();
	Timer(int, int);
	Timer(const Timer&);

	int getHours() const;
	int getMinutes() const;
	std::string toString() const;

	void operator= (const Timer&);
	void operator+= (const Timer&);
};

Timer::Timer() : hours(0), minutes(0) {}

Timer::Timer(int hh, int mm) {
	while(mm >=60){
		hh++;
		mm = mm - 60;
	}
	while (hh >= 24){
		hh = hh - 24;
	}
	hours = hh;
	minutes = mm;
}

Timer::Timer(const Timer &t) {
	hours = t.hours;
	minutes = t.minutes;
}

int Timer::getHours() const {
	return hours;
}

int Timer::getMinutes() const {
	return minutes;
}

std::string Timer::toString() const {
	 std::stringstream aux;

	 if (hours < 10) {
		 aux << "0";
	 }
	 aux << hours << ":";
	 if (minutes < 10) {
		 aux << "0";
	 }
	 aux << minutes;
	 return aux.str();
}

void Timer::operator= (const Timer &right) {
	hours = right.hours;
	minutes = right.minutes;
}

void Timer::operator+= (const Timer &right) {
	int mm, hh;
	hh = hours + right.hours;
	mm = minutes + right.minutes;
	while(mm >=60){
		hh++;
		mm = mm - 60;
	}
	while (hh >= 24){
		hh = hh - 24;
	}
	hours = hh;
	minutes = mm;
}

bool operator== (const Timer &left, const Timer &right) {
	if(left.getMinutes() == right.getMinutes() && left.getHours() == right.getHours()){
		return true;
	}
	else{
		return false;
	}
}

bool operator> (const Timer &left, const Timer &right) {
	if(left.getHours() != right.getHours()){
		if(left.getHours() > right.getHours()){
			return true;
		}
		else{
			return false;
		}
	} else{
		if(left.getMinutes() > right.getMinutes()){
			return true;
		}
		else{
			return false;
		}
	}
}

#endif /* TIMER_H_ */