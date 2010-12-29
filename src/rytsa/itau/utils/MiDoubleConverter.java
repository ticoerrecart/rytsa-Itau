package rytsa.itau.utils;

import java.text.DecimalFormat;

import com.thoughtworks.xstream.converters.basic.DoubleConverter;

public class MiDoubleConverter extends DoubleConverter {

	@Override
	public String toString(Object obj) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.####################");
		return df.format(obj);
	}

}