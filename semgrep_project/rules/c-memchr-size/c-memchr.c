char array[15];
initialize(array);
void *pos = memchr(array, '@', 36); // noncompliant

char array[15];
initialize(array);
void *pos = memchr(array, '@', 15); //compliant