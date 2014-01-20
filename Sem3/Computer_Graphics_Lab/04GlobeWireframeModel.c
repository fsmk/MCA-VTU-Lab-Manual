#include <GL/glut.h>
#include <math.h>
#include <stdio.h>

void draw_pixel(GLint cx, GLint cy)
{    
	glColor3f(1.0,0.0,0.0);
	glBegin(GL_POINTS);
	glVertex2i(cx,cy);
	glEnd();
}

void plotpixels(GLint h, GLint k, GLint x, GLint y)
{
	draw_pixel(x+h,y+k);
	draw_pixel(-x+h,y+k);
	draw_pixel(x+h,-y+k);
	draw_pixel(-x+h,-y+k);
	draw_pixel(y+h,x+k);
	draw_pixel(-y+h,x+k);
	draw_pixel(y+h,-x+k);
	draw_pixel(-y+h,-x+k);
}
void Circle_draw(GLint h, GLint k, GLint r)  // Midpoint Circle Drawing Algorithm
{
	 GLint d =  1-r, x=0, y=r;
	 while(y > x)
	 {
		 plotpixels(h,k,x,y);
		 if(d < 0) d+=2*x+3;
		 else
		 {d+=2*(x-y)+5;
		  --y;
		 }
		 ++x;
	 }
	 plotpixels(h,k,x,y);
}

void Globe_Wireframe()
{
	GLint xc=100, yc=200, r=50;
	GLint i,n=50;
	for(i=0;i<n;i+=5)
	{
		Circle_draw(xc,yc+i,r-i);
	}
	for(i=0;i<n;i+=5)
	{
		Circle_draw(xc,yc-i,r-i);
	}

}


void init(void)
{
	glClearColor(1.0,1.0,1.0,0.0);  // Set display window color to white
	//glColor3f(0.0, 1.0, 1.0);
	glMatrixMode(GL_PROJECTION);  // Set Projection parameters 
	gluOrtho2D(0.0,400.0,0.0,300.0);  
}
void display(void)
{   
	glClear(GL_COLOR_BUFFER_BIT);  // Clear Display Window
	glPointSize(2.0);
	
	Globe_Wireframe();
	glFlush(); // Process all OpenGL routines as quickly as possible
}

int main(int argc, char **argv)
{   glutInit(&argc,argv); // Initialize GLUT
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB | GLUT_DEPTH); // Set Display mode
	glutInitWindowPosition(50,50);  // Set top left window position
	glutInitWindowSize(800,800); // Set Display window width and height 
	glutCreateWindow("Midpoint Circle Drawing Algorithm"); // Create Display Window
	init();
	glutDisplayFunc(display); // Send the graphics to Display Window
	glutMainLoop();
	return 0;
}
