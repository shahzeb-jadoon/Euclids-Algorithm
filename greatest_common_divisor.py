def greatest_common_divisor(larger_num, smaller_num):
    """This function uses Euclid's algorithm to calculate the Greatest Common Divisor
        of two non-negative integers

        pre: larger_num & smaller_num are both non-negative integers, and larger_num > smaller_num
        post: returns the greatest common divisor of larger_num & smaller_num
    """

    while smaller_num != 0:
        remainder = larger_num % smaller_num
        larger_num, smaller_num = smaller_num, remainder

    return larger_num

def main():
    larger_num = 60
    smaller_num = 24

    print(greatest_common_divisor(larger_num, smaller_num))

if __name__ == "__main__":
    main()