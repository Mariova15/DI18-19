using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.modelo
{
    class PersonaContacto
    {

        private String nombre;
        private int numTelf;

        public PersonaContacto(string nombre, int numTelf)
        {
            this.nombre = nombre;
            this.numTelf = numTelf;
        }

        public string Nombre { get => nombre; set => nombre = value; }
        public int NumTelf { get => numTelf; set => numTelf = value; }
    }
}
