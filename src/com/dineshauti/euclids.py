#!/usr/bin/env python
import numpy as np


def euclid_calc(input_num):
    dividend = input_num.max()
    divisor = input_num.min()
    while divisor != 0:
        remainder = dividend % divisor
        dividend = divisor
        divisor = remainder
    return dividend


def main():
    print "GCD for given number is %d" % euclid_calc(np.array([400,124]))


# Standard boilerplate to call the main() function to begin
# the program.
if __name__ == '__main__':
    main()
