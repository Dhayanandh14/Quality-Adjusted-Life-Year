N=int(input())
tot=0
for i in range(0,N):
 lst = list(input().split())
 q=float(lst[0])
 l=float(lst[1])
 tot = q*l+tot
print(tot)
