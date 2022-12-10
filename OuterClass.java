package InnerClass;

public class OuterClass {

	class InnerClass {
		void display() {
			System.out.println("this is inner class");
		}
	}

	public void OuterClassMethod() {
		System.out.println("this is outer class method");

		class InnerOuterClass {
			void LocalInnerMethod() {
				System.out.println("name");
			}
		}
		InnerOuterClass ioc = new InnerOuterClass();
		ioc.LocalInnerMethod();

	}
}
