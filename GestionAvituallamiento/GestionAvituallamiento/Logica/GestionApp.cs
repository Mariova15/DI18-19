using GestionAvituallamiento.modelo;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.Logica
{
    public class GestionApp
    {
        public ObservableCollection<Avituallamiento> listaAvituallamientos { get; set; }

        public GestionApp() {
            listaAvituallamientos = new ObservableCollection<Avituallamiento>();
        }

        public void annadirAvituallamiento(String nombreCarrera, long puntoKilometrico,
            String nombrePersona, int numTelf, MaterialDisponible material)
        {

            listaAvituallamientos.Add(new Avituallamiento(nombreCarrera, puntoKilometrico, new PersonaContacto(nombrePersona, numTelf), material));

        }
    }
}
