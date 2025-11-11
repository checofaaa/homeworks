package org.example.figure;

 class Circle implements Figure {
        private double radius;
        private String backgroundColor;
        private String borderColor;

        public Circle(double radius, String backgroundColor, String borderColor) {
            this.radius = radius;
            this.backgroundColor = backgroundColor;
            this. borderColor = borderColor;
        }

        @Override
        public double calculatePerimeter() {
            return Math.round(2 * Math.PI * radius);
        }

        @Override
        public double calculateArea() {
            return Math.round(Math.PI * Math.pow(radius, 2));
        }

        @Override
        public String getFigureName() {
             return "Круг";
        }

        @Override
         public String getBackgroundColor() {
            return backgroundColor;
        }

        @Override
        public String getBorderColor() {
            return borderColor;
        }
}
