#!/usr/bin/env python
import timeit


def quick_sort(unsorted_array):
    if len(unsorted_array) <= 1:
        return unsorted_array
    pivot = unsorted_array[len(unsorted_array) // 2]
    l = [x for x in unsorted_array if x < pivot]
    m = [x for x in unsorted_array if x == pivot]
    r = [x for x in unsorted_array if x > pivot]
    return quick_sort(l) + m + quick_sort(r)


def main():
    unsorted_array = [4,9,6,2,1,3,5,8,7,15,10,14,12,11,20,13,19,18,16,17]
    # Start timer
    start = timeit.default_timer()
    # Actual computation
    sorted_array = quick_sort(unsorted_array)
    # Stop timer
    stop = timeit.default_timer()
    print ("Total time required: %f" % (stop - start))
    print sorted_array


# Standard boilerplate to call the main() function to begin
# the program.
if __name__ == '__main__':
    main()