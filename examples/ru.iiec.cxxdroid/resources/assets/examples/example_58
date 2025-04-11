#include <SFML/System.hpp>
#include <SFML/Graphics.hpp>

int main(int argc, char *argv[])
{
	sf::RenderWindow window(sf::VideoMode::getDesktopMode(), "Hello SFML");
	sf::Clock clock;
	while (window.isOpen())
	{
		// It is required to poll all events so we can paint
		sf::Event event;
		while (window.pollEvent(event))
			;
		window.clear(sf::Color(255, 255, 255));
		window.display();
		if (clock.getElapsedTime().asMilliseconds() > 2000)
			break;
	}
	return 0;
}