package bufferreaderdemo;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class BufferReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader b=new BufferedReader(new
				InputStreamReader(System.in));
		String name = null;
		try {
			name = b.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name);

	}



			}
