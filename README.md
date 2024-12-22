# advenced-java

-----

## 디자인 패턴

### 템플릿 메서드 패턴
> 변하는 부분(비즈니스 로직)과 변하지 않는 부분(공통 로직)을 나뉘어 핵심 기능과 부가 기능을 구분한다. 템플릿 메서드 패
턴은 부모 클래스에 변하지 않는 템플릿 코드로 작성하고 변하는 부분은 자식 클래스에 두고 상속과 오버라이딩을
사용해서 처리한다.


### 템플릿 메서드 패턴 단점
 1. 부모 클래스와 자식 클래스가 컴파일 시점에 `강하게 결합`된다. 이것은 자식 클래스가 부모 클래스의 코드를 사용하든 하용하지 않든 간에 부모 클래스의 코드를 가지고 있다는 것이다. 예를 들어 부모 클래스에 추상메서드가 추가된다면 모든 자식 클래스는 새롭게 추가된 추상메서드를 모두 구현할 의무가 생긴다.    


### 템플릿 메서드 패턴 예시
```java
@Slf4j
public abstract class AbstractTemplate {
    
 public void execute() {
     long startTime = System.currentTimeMillis();
     
     //비즈니스 로직 실행
     call(); //상속
     //비즈니스 로직 종료
         
     long endTime = System.currentTimeMillis();
     long resultTime = endTime - startTime;
     log.info("resultTime={}", resultTime);
 }
 
 protected abstract void call();
 
}
```

### 전략 패턴
> 전략 패턴은 변하지 않는 부분을 `Context` 라는 곳에 두고, 변하는 부분을 `Strategy` 라는 인터페이스를 만들고 해당
인터페이스를 구현하도록 해서 문제를 해결한다. `상속`이 아니라 `위임`으로 문제를 해결.

### 전략 패턴 예시
[strategy-example](src%2Ftest%2Fjava%2Fadvenced%2Fjava%2Fstrategy%2Fcode%2Fstrategy)

### 템플릿 콜백 패턴
> 콜백(callback) 또는 콜애프터 함수(call-after function)는 다른 코드의 인수로서 넘겨주는 실행 가능한 코드를 말한다. `callback` 은 코드가 호출(call)은 되는데 코드를 넘겨준 곳의 뒤(back)에서 실행된다는 뜻이다. 스프링에서는 `ContextV2 와 같은 방식의 전략 패턴`을 `템플릿 콜백 패턴`이라 한다. 전략 패턴에서 Context 가
템플릿 역할을 하고, Strategy 부분이 콜백으로 넘어온다 생각하면 된다.

### 템플릿 콜백 예시
[callback-example](src%2Ftest%2Fjava%2Fadvenced%2Fjava%2Fstrategy%2Fcode%2Fcallback)

