# Factorial
재귀로 구현할 수 있는 가장 간단한 문제

## 어떻게 동작하나?
- 입력 값부터 1씩 감소시키면서 모든 값을 곱함
- n * (n-1) * (n-2) * (n-3) * ... * 3 * 2 * 1
- n! 로 나타냄

## 구현
```java
public int factorial(int n) {
    if (n == 1) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
```
