n = int(raw_input())
N = set(map(int, raw_input().split(' ')))
m = int(raw_input())
M = set(map(int, raw_input().split(' ')))
print(len(N.difference(M)))
