package ca.sheridancollege.project;

/**
 * Enum class to define Suits of Cards
 * @author JAhmadBustani
 * @modifier JaykumarChaudhari
 * @modifier ElmerAlmeida
 * @modifier JeremiahTorralba
 */
public enum Suits {
    DIAMONDS {
        @Override
        public String toString() {
            return "Diamonds";
        }
    }, 
    CLUBS {
        @Override
        public String toString() {
            return "Clubs";
        }
    }, 
    HEARTS {
        @Override
        public String toString() {
            return "Hearts";
        }
    }, 
    SPADES {
        @Override
        public String toString() {
            return "Spades";
        }
    };
}