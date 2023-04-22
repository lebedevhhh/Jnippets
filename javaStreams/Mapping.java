public class Mapping{
	public  static viod main(String... args){
		ArrayList<String> array=new ArrayList<>();
		array.add("name");
		array.add("foo");
		array.add("bar");
		array.add("testing");
		array.add("hello world");
		array.stream().filter(name -> name.length > 0).map(String::toString);
	}
}
