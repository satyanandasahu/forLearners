package com.example.lambda;

public interface NumericArrayFunction<T> {

	T function(T[] n) throws EmptyArrayException;
}
