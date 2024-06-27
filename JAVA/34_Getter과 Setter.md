## Setter
- 객체의 필드를 외부에서 변경할 경우 객체의 무결성이 깨질 수 있다
- 객체 지향 프로그래밍에서는 직접적인 외부에서의 필드 접근을 막고 대신 메소드를 통해 필드에 접근하는 것을 선호
- 메소드는 데이터를 검증해서 유효한 값만 필드에 저장할 수 있기 때문이고 이러한 역할을 하는 메소드가 `Setter`
```java
private double speed;

public void setSpeed(double speed) {
    if(speed < 0) {
        this.speed = 0;
        return;
    } else {
        this.speed = speed;
    }
}
```

## Getter
- 외부에서 객체의 필드를 읽을 때 필요한 메소드가 `Getter`
- 필드값이 객체 외부에서 사용하기에 부적절한 경우, 메소드로 적절한 값으로 변환해서 return 할 수 있기 때문
```java
private double speed;

public double getSpeed() {
    double km = speed*1.6;
    return km;1
}
```

예시
```java
public class Car {

	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
}
```

```java
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println(myCar.getSpeed());
		
		myCar.setSpeed(50);
		System.out.println(myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println(myCar.getSpeed());

	}

}
```

### 결과
```
0
50
0
```