package utils;

public enum URL {
	INGREDIENT {
		public String toString() {
			return "http://localhost:8000/api/ingredients/{id}";
		}
	},
	INGREDIENTS {
		public String toString() {
			return "http://localhost:8000/api/ingredients";
		}
	}
}
