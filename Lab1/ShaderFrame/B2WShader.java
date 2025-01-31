
public class B2WShader extends Shader{
	
	void shader(double[] p, double u, double v, double t) {
		
		double[] at = {u*15, v*15, 0.5*t};
		int max_order = 2;
		double[] F = new double[2];
		double[][] delta = new double[2][3];
		int[] ID = new int[2];
		 
		WorleyNoise.noise(at, max_order, F, delta, ID);
		
		
		double originU, originV, r;
		
		originU = 0.5 + Math.pow(u, 2)*Math.sin(t*0.5) + Math.pow((F[1]-F[0]), 0.5);
		originV = 0.5 + Math.pow(v, 2)*Math.cos(t*0.5) + Math.pow((F[1]-F[0]), 0.5);
		r = 0.6;
		
		
		p[0] = originU*r + originV*r;
		p[1] = originU*r + originV*r;
		p[2] = originU*r + originV*r;
		//p[1] = originU*r + originV*r;
		//p[2] = p[0]*p[1];
		
	}

}
