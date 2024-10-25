#!/bin/bash

# Verificar que se hayan proporcionado dos argumentos: el archivo Java y el número de veces
if [ $# -ne 2 ]; then
    echo "Uso: $0 <archivo_java> <n_veces>"
    exit 1
fi

archivo_java=$1
n_veces=$2

# Verificar que el archivo .java existe
if [ ! -f "$archivo_java" ]; then
    echo "Error: El archivo $archivo_java no existe."
    exit 1
fi

# Obtener el nombre de la clase (nombre del archivo sin extensión)
clase=$(basename "$archivo_java" .java)

# Compilar el archivo .java
echo "Compilando $archivo_java..."
javac "$archivo_java"

# Verificar que la compilación fue exitosa
if [ $? -ne 0 ]; then
    echo "Error: Fallo la compilación de $archivo_java."
    exit 1
fi

# Ejecutar la clase compilada N veces y mostrar el resultado de cada ejecución con el tiempo
for (( i=1; i<=n_veces; i++ ))
do
    echo "Ejecución $i:"
    
    # Medir el tiempo de ejecución
    start_time=$(date +%s%N)
    java "$clase"
    end_time=$(date +%s%N)
    
    # Calcular el tiempo en segundos
    elapsed_time=$(( (end_time - start_time) / 1000000 )) # Tiempo en milisegundos

    echo "Tiempo de ejecución: $elapsed_time ms"
    echo "---------------------"
done

