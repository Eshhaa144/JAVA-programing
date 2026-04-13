marks=[]
avg=0
print("enter number of students: ")
n = int(input())
for i in range(n):
  print("enter marks of student ",i+1,": ")
  m=int(input())
  marks.append(m)
  avg+=m
print("marks of students are: ",marks)
max,min=marks[0],marks[0]
for i in range(1,n):
  if marks[i]>max:
    max=marks[i]
  if marks[i]<min:
    min=marks[i]
print("maximum marks: ",max)
print("minimum marks: ",min)
print("average marks: ",avg/n)