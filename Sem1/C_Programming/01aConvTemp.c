#include <stdio.h>
#define FREEZING_PT 32.0f
#define CONV_FACTOR (5.0f/9.0f)

int main(void)
{
    float fahrenheit, celsius;

    printf("\nEnter temperature in Celsius\n");
    scanf("%f",&celsius);

	fahrenheit = (celsius/CONV_FACTOR) +FREEZING_PT ;
    printf("\nTemperature in Fahrenheit is: %f\n",fahrenheit);

    printf("\nEnter temperature in Fahrenheit\n");
    scanf("%f",&fahrenheit);

    //celsius = (fahrenheit - 32.0f) * (5.0f/9.0f);
    celsius = (fahrenheit - FREEZING_PT) * CONV_FACTOR;
    printf("\nTemperature in Celsius is: %f\n",celsius);


    return 0;
}
