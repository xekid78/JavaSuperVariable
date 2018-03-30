# JavaSuperVariable
super変数

## 処理
`super`変数を使って、`JewelryBox()`クラスから親クラスのコンストラクタの変数を出力。

## コード
```
public class Super {

	public static void main(String[] args) {
		Hello2 hello = new Hello2();
		hello.say_hello();

	}

}

class Greeting {
	public String msg;
	public String target;

	public Greeting() {
		this.msg = "Hello";
		this.target = "World";
	}

	public void say_hello() {
		System.out.println(this.msg + " " + this.target);
	}
}

class Hello2 extends Greeting {

	public void say_hello() {
		System.out.println(super.msg + " " + super.target);
		System.out.println("WA HA HA HA");
	}
}
```

## 出力結果  
```
Hello World
WA HA HA HA
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
