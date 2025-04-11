#include <stdio.h>
#include <allegro5/allegro.h>
#include <allegro5/allegro_font.h>
#include <allegro5/allegro_ttf.h>

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
	if (!al_init_font_addon())
	{
		fprintf(stderr, "Couldn't initialize Allegro text addon\n");
		return -1;
	}
	if (!al_init_ttf_addon())
	{
		fprintf(stderr, "Couldn't initialize Allegro ttf\n");
		return -1;
	}
	ALLEGRO_FONT *font = al_load_font("/system/fonts/Roboto-Regular.ttf", 256, 0);
	if (font == NULL)
	{
		fprintf(stderr, "Couldn't load font\n");
		return 1;
	}
	const char *text = "Hello, world!";
	int bx, by, bw, bh;
	al_get_text_dimensions(font, text, &bx, &by, &bw, &bh);
	bw += bx;
	bh += by;
	// Better scaling quality
	al_set_new_bitmap_flags(ALLEGRO_MIN_LINEAR | ALLEGRO_MAG_LINEAR);
	ALLEGRO_BITMAP *textimage = al_create_bitmap(bw, bh);
	al_set_target_bitmap(textimage);
	al_draw_text(font, al_map_rgb(0xFF, 0xFF, 0xFF), 0, 0, 0, text);
	al_set_target_backbuffer(display);

	int w = al_get_display_width(display);
	int h = al_get_display_height(display);

	// Our text always has width much bigger than height, use this
	al_draw_scaled_bitmap(textimage, 0, 0, bw, bh, 0, (h - bh) / 2, w, bh * w / bw, 0);
	al_flip_display();
	al_rest(5.);
	al_destroy_display(display);
	return 0;
}