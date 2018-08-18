from fractions import gcd
r = 1
for i in range(2, 21):
    r = r * i // gcd(r, i)

print(r)
