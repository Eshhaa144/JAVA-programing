import math
# # find greatest common divisor of array
# def findGCD(arr):

#     gd,min,max=arr[0],arr[0],arr[0]
#     for i in range(1,len(arr)):
#         if arr[i]>max:
#             max=arr[i]
#         if arr[i]<min:
#             min=arr[i]
#     gd=math.gcd(min,max)
#     return gd
# given an integer n return true if n has exactly 3 positive divisor
def checkdiv(n):
  c=0
  for i in range(1,n+1):
    if(n/i==0):
      c+=1
  if(c==3):
    return True
  else:
    return False     
    
