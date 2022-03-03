#include <stdio.h>
#include <SFML/System.hpp>
#include <SFML/Graphics.hpp>

// Function for scaling and placing a text to fill width
void placeText(sf::Text &text, float w, float h)
{
	// Make text position start from center
	sf::FloatRect textRect = text.getLocalBounds();
	text.setOrigin(textRect.left + textRect.width / 2.0f, textRect.top + textRect.height / 2.0f);
	float textwidth = textRect.width;
	// Our text always has width much bigger than height, use this
	text.setScale(w / textwidth, w / textwidth);
	text.setPosition(w / 2.f, h / 2.f);
}

int main(int argc, char *argv[])
{
	sf::RenderWindow window(sf::VideoMode::getDesktopMode(), "Hello SFML Image");
	sf::Font font;
	if (!(font.loadFromFile("/system/fonts/Roboto-Regular.ttf")))
	{
		fprintf(stderr, "Couldn't load font\n");
		return 1;
	}
	sf::Text text;
	text.setFont(font);
	text.setString("Hello, world!");
	text.setCharacterSize(256);

	sf::View view = window.getDefaultView();
	placeText(text, view.getSize().x, view.getSize().y);
	sf::Clock clock;
	while (window.isOpen())
	{
		// Handle screen resizes
		sf::Event event;
		while (window.pollEvent(event))
		{
			if (event.type == sf::Event::Resized)
			{
				view.setSize(event.size.width, event.size.height);
				view.setCenter(event.size.width / 2, event.size.height / 2);
				window.setView(view);

				placeText(text, event.size.width, event.size.height);
			}
		}

		window.clear();
		window.draw(text);
		window.display();
		if (clock.getElapsedTime().asMilliseconds() > 5000)
			break;
	}
	return 0;
}