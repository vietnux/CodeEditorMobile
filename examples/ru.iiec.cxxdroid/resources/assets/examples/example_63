#include <stdio.h>
#include <allegro5/allegro.h>

int main(int argc, char *argv[])
{
	if (!al_init())
	{
		fprintf(stderr, "Couldn't initialize Allegro\n");
		return 1;
	}
	ALLEGRO_DISPLAY *display = al_create_display(640, 480);
	if (display == NULL)
	{
		fprintf(stderr, "Couldn't create display\n");
		return 1;
	}
	al_clear_to_color(al_map_rgb(0xFF, 0xFF, 0xFF));
	al_flip_display();
	al_rest(2.);
	al_destroy_display(display);
	return 0;
}