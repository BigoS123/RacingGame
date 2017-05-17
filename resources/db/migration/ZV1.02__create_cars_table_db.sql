CREATE TABLE "main"."cars" (
"carId"  INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
"name"  TEXT(50) NOT NULL,
CONSTRAINT "carId" UNIQUE ("carId"),
CONSTRAINT "name" UNIQUE ("name")
)