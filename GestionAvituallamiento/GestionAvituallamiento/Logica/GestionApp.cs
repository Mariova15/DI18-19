using GestionAvituallamiento.modelo;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.logica
{
    public class GestionApp
    {
        public ObservableCollection<Avituallamiento> listaAvituallamientos { get; set; }
        public ObservableCollection<MaterialDisponible> listaMateriales { get; set; }

        public GestionApp() {
            listaAvituallamientos = new ObservableCollection<Avituallamiento>();
            listaMateriales = new ObservableCollection<MaterialDisponible>();
        }

        public void annadirAvituallamiento(Avituallamiento avituallamiento, PersonaContacto personaContacto)
        {
            avituallamiento.PersonaContacto = personaContacto;
            listaAvituallamientos.Add(avituallamiento);
        }

        public void annadirMaterial(MaterialDisponible material)
        {
            listaMateriales.Add(material);
        }

        public void borrarAvituallamiento(Avituallamiento avituallamiento)
        {
            listaAvituallamientos.Remove(avituallamiento);
        }

        public void borrarMaterial(MaterialDisponible material)
        {
            listaMateriales.Remove(material);
        }

        public void modificarAvituallamiento(Avituallamiento avituallamiento, PersonaContacto personaContacto, int indexModificar)
        {
            avituallamiento.PersonaContacto = personaContacto;
            listaAvituallamientos[indexModificar] = avituallamiento;
        }

    }
}
