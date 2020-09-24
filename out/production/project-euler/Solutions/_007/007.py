primes = []; j=2

def isPrime(n, primes):
    for i in range(2, len(primes) -1):
        if n%i == 0:
            return False
while len(primes) <= 10001:
    value = isPrime(j, primes)
    if value <> False:
        primes.append(j)
    j += 1
print max(primes)
        
