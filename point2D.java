
class point2D
{
public static void main(String[] args){
	float x=0.0f;
	float y=0.0f;
	point2D(float a,float b)
	{
		x=a;
		y=b;
	}
	point2D(){}
	float getX()
	{
		return x;
	}
	void setX(float a)
	{
		x=a;
	}
	float getY()
	{
		return y;
	}
	void setY(float b)
	{
		y=b;
	}
	void setXY(float a,float b)
	{
		x=a;
		y=b;
	}
	float[] getXY()
	{
		float f[]=new float[2];
		f[0]=x;
		f[1]=y;
		return (f);
	}
}


}