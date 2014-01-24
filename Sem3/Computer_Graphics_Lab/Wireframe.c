#include <GL/gl.h>
#include <GL/glut.h>
void display(void)
{
	glClearColor(0, 0, 0, 0);
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(1.0, 1.0, 1.0);
	glRotatef(30, 1.0, 0.0, 0.0);
	glRotatef(30, 0.0, 1.0, 0.0);
//	glutWireCube(1);
//	glutWireTetrahedron();
	glutWireSphere(0.5,25,24);
	glFlush();
}
int main(int argc, char **argv)
{
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGBA);
	glutInitWindowSize(800, 800);
	glutInitWindowPosition(0, 0);
	glutCreateWindow("Test Window");
	glutDisplayFunc(display);
	glutMainLoop();
	return 0;
}

