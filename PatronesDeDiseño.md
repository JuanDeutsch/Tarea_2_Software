# Tarea_2_Software
# Patrones de diseño

Juan Manuel Deutsch,
Santiago Contreras,
Nicolas Wilches

# 1. Comportamiento: Template Method

El primer problema nos presenta la necesidad de creación de múltiples objetos que operen bajo
una plantilla o clase abstracta, dicha plantilla debe de contar con métodos abstractos los
cuales obligatoriamente deben de ser implementados por las subclases y además puede contar
con pasos opcionales, lo que convierte a Template Method la mejor opción a elegir en cuanto
a patrón de diseño para el caso actual.

### Diagrama de clases:

# 2. Estructural: Adapter

Para este problema se determino utilizar el patron de diseño Adapter ya que este solucionaba de manera efectiva el problema presentado de la incompatibilidad de un nuevo sistema de pago Online a nuestra estructura de pagos general, por loq ue la creaccion de un adaptador era crucial para la solucion de este problema.

### Diagrama de clases:

![UML Adapter.png]([..%2F..%2FDownloads%2FUML%20Adapter.png](https://lucid.app/lucidchart/92af702c-15ad-4321-b738-ac6171bce657/edit?view_items=28ZlfHK9HVde%2Cngumq4JSk9w1%2C28Zl-Utp8iQ_%2C28ZlgdV3vHZ.%2Cnvsm40XGnex_%2CXDMmYYHi1Lnr%2C_DMmnrHV4s80&invitationId=inv_f0d1bd8f-b7af-4c94-8743-c726c660ca45))



# 3. Creacional: Builder

Para este problema se identificó que de los patrones de diseño, se tenia que usar el de tipo
creacional y de este el caso de builder, esto porque se tenía que crear un producto complejo
paso a paso, la solución builder permitia solucionar el problema de una manera mas sencilla.

### Diagrama de clases:
![Clase UML (1)](https://github.com/JuanDeutsch/Tarea_2_Software/assets/87861322/726b7cea-4da8-4528-bfa7-c4c963c31dd8)

