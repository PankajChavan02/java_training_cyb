import java.util.List;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Latest program");
		var demo = 10;
		var name = "Pankaj";
		var list = List.of(1,2,3,4,5,6,7,8);
		
		for(var e : list)
			System.out.print(e+"->");
		System.out.println();
		System.out.println(demo +" "+name);
		
		for(var i=0;i<10;i++) {
			System.out.println(i);
		}

	}

}
