class solution:

    def palindrome(self, n):
        m = n
        revNum = 0
        while(m > 0):
            rem = m%10
            m = m//10
            revNum = revNum*10 + rem
        
        if(revNum == n):
            print(f"{n} is a palindrome number")
        else:
            print(f"{n} is not a palindrome number")
    

sol = solution()

for i in range(5):
    print("Enter any number: ")
    n = int(input())
    sol.palindrome(n)



