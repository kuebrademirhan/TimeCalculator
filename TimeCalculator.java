public class TimeCalculator {
	public static long getSeconds(int h11, int m12, int s13, int h21, int m22, int s23) {
		long s = 0;

		if(s23<0 || s23>59){
			s=-23;
			return s;
		}
		if(m22<0 || m22>59){
			s=-22;
			return s;
		}
		if(h21<0 || h21>23){
			s=-21;
			return s;
		}
		if(s13<0 || s13>59){
			s=-13;
			return s;
		}
		if(m12<0 || m12>59){
			s=-12;
			return s;
		}
		if(h11<0 || h11>23){
			s=-11;
			return s;
		}

		int hdiff;
		int mdiff;
		int secdiff;

		if(h11<h21){
			hdiff=h21-h11;
		}else{
			hdiff=(24-h11)+h21;
		}

		if(m12<m22){
			mdiff=m22-m12;
		}else{
			mdiff=(60-m12)+m22;
			hdiff=hdiff-1;
		}

		if(s13<s23){
			secdiff=s23-s13;
		}else{
			secdiff=(60-s13)+s23;
			mdiff=mdiff-1;
		}

		s=hdiff*3600+mdiff*60+secdiff;

		// TODO
		return s;
	}
}
