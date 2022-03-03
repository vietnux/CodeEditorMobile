#include <stdio.h>
#include <SDL2/SDL.h>
#include <SDL2/SDL_ttf.h>

// Function for loading font and drawing text into SDL_Texture
static SDL_Texture *loadText(SDL_Renderer *renderer, const char *text)
{
	if (TTF_Init() == -1)
	{
		fprintf(stderr, "TTF_Init Error: %s\n", TTF_GetError());
		return NULL;
	}
	TTF_Font *font = TTF_OpenFont("/system/fonts/Roboto-Regular.ttf", 256);
	if (font == NULL)
	{
		fprintf(stderr, "TTF_OpenFont Error: %s\n", TTF_GetError());
		return NULL;
	}
	SDL_Color color = {255, 255, 255};
	SDL_Surface *surface = TTF_RenderText_Solid(font, text, color);
	SDL_Texture *texture = SDL_CreateTextureFromSurface(renderer, surface);
	SDL_FreeSurface(surface);
	if (texture == NULL)
	{
		fprintf(stderr, "SDL_CreateTextureFromSurface Error: %s\n", SDL_GetError());
		return NULL;
	}
	return texture;
}

int main(int argc, char *argv[])
{
	if (SDL_Init(SDL_INIT_EVERYTHING) != 0)
	{
		fprintf(stderr, "SDL_Init Error: %s\n", SDL_GetError());
		return 1;
	}
	SDL_Window *window = SDL_CreateWindow("Hello SDL2-ttf", SDL_WINDOWPOS_UNDEFINED, SDL_WINDOWPOS_UNDEFINED, 640, 480, 0);
	if (window == NULL)
	{
		fprintf(stderr, "SDL_CreateWindow Error: %s\n", SDL_GetError());
		return 1;
	}
	SDL_Renderer *renderer = SDL_CreateRenderer(window, -1, 0);
	if (renderer == NULL)
	{
		fprintf(stderr, "SDL_CreateRenderer Error: %s\n", SDL_GetError());
		return 1;
	}
	// Better scaling quality
	SDL_SetHint(SDL_HINT_RENDER_SCALE_QUALITY, "2");
	SDL_Texture *textTexture = loadText(renderer, "Hello, world!");
	if (textTexture == NULL)
	{
		fprintf(stderr, "Couldn't load text texture\n");
		return 1;
	}
	int tw, th;
	SDL_QueryTexture(textTexture, NULL, NULL, &tw, &th);
	int w, h;
	SDL_GetRendererOutputSize(renderer, &w, &h);
	SDL_Rect dest;
	// Our text always has width much bigger than height, use this
	dest.x = 0;
	dest.w = w;
	dest.h = th * w / tw;
	dest.y = (h - dest.h) / 2;
	SDL_RenderClear(renderer);
	SDL_RenderCopy(renderer, textTexture, NULL, &dest);
	SDL_RenderPresent(renderer);
	SDL_Delay(5000);
	SDL_DestroyWindow(window);
	SDL_Quit();
	return 0;
}