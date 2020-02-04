package lamda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

interface consumerInterface{
	static void DisplyName(String name){
		System.out.println("Name : "+name);
	}
	
	static void show(String msg){
		System.out.println("Message  "+msg);
	}
	
	static void biConsumershow(String name,Integer age){
		System.out.println("USING BICONSUMER CUSTOM  "+name +" "+age);
	}
	
	static int functionShow(String a){
		System.out.println("Function Method "+a );
		return 1;
	}
	
	static int BifunctionShow(String a,String b){
		System.out.println("Function Method "+a  +" "+b);
		return 1;
	}
}

public class ConsumerDemo implements consumerInterface{

	public static void main(String[] args) {		
		Consumer<String> cumsumerObj = consumerInterface::DisplyName;
		Consumer<String> cunsumerObj1 = consumerInterface::show;
		cumsumerObj.accept("Pandurang Nawale");
		cunsumerObj1.accept("ABC");
		
		BiConsumer<String, Integer> biCons =consumerInterface::biConsumershow;
		biCons.accept("Pandurang", 25);
		
		BiConsumer<String, Integer> biObj = (a,b)->{
			System.out.println("BICONSUMER ORGIGINAL"+ a + " " +b);
		};
		biObj.accept("Datta", 25);
		
		Function<String,Integer> functionObj =consumerInterface::functionShow;
		functionObj.apply("Pandurang");
		
		BiFunction<String, String, Integer> bifunObj=consumerInterface::BifunctionShow;
		bifunObj.apply("Pandurang", "Poonam");
	}

}
