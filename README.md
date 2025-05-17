# Tablas

## Entidades
- Estudiante  
- Dirección  
- Curso  
- Profesor  

## Relaciones

| Relación              | Tipo de Relación    | Detalles                                               |
|-----------------------|---------------------|--------------------------------------------------------|
| Estudiante - Dirección| One to One (1:1)    | Cada estudiante tiene una dirección única             |
| Curso - Estudiante    | One to Many (1:N)   | Un curso tiene muchos estudiantes                     |
| Estudiante - Curso    | Many to One (N:1)   | Muchos estudiantes están en un curso                  |
| Curso - Profesor      | Many to Many (N:M)  | Varios profesores dictan varios cursos (tabla intermedia) |
## Imagen de referencia
![image](https://github.com/user-attachments/assets/2bf276bb-2eb7-4f44-920e-00dcdd9c0b34)
