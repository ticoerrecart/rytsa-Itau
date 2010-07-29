package rytsa.itau.testDBF;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.linuxense.javadbf.DBFException;
import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFReader;

public class TestReadDBF {
	public static void main(String args[]) {

		try {

			// create a DBFReader object
			InputStream inputStream = new FileInputStream("C:\\Documents and Settings\\rerrecart\\Mis documentos\\rytsa\\Itau\\DBFs\\curva_4.DBF");
			DBFReader reader = new DBFReader(inputStream);

			// get the field count if you want for some reasons like the
			// following
			int campos = reader.getFieldCount();
			for (int i = 0; i < campos; i++) {
				DBFField field = reader.getField(i);
				System.out.println(field.getName());
			}

			// Now, lets us start reading the rows
			int filas = reader.getRecordCount();
			
			for (int j = 0; j < filas; j++) {
				try {
					Object[] rowObjects = reader.nextRecord();
					 for( int i=0; i<rowObjects.length; i++) {
						 System.out.print( rowObjects[i] + " | " );
					 }
					 System.out.println("---------------------------" );

				}  catch (DBFException e) {
					System.out.println(e.getMessage());
				}	
				
			}
			System.out.println( filas);
			
			inputStream.close();
		} catch (DBFException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
