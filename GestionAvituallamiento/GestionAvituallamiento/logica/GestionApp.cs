using GestionAvituallamiento.modelo;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;

namespace GestionAvituallamiento.logica
{
    public class GestionApp
    {

        public ObservableCollection<Carrera> listaCarreras { get; set; }

        public ObservableCollection<Material> listaMateriales { get; set; }

        public GestionApp()
        {
            listaCarreras = new ObservableCollection<Carrera>();
            listaMateriales = new ObservableCollection<Material>();
        }

        public void annadirMaterial(Material material)
        {
            listaMateriales.Add(material);
        }

        public void borrarMaterial(Material material)
        {
            Boolean borrar = true;
            foreach (Carrera carrera in listaCarreras) {
                foreach(Avituallamiento avituallamiento in carrera.listaAvituallamientos){
                    foreach(Material matComp in avituallamiento.listaMateriales){
                        if (matComp.NombreProducto.Equals(material.NombreProducto))
                        {
                            borrar = false;
                        }
                    }
                }
            }
            if (borrar)
            {
                listaMateriales.Remove(material);
            }
            else {
                MessageBox.Show("No se puede borrar");
            }          
            
        }

        public void annadirCarrera(Carrera carrera)
        {
            listaCarreras.Add(carrera);
        }

        public void borrarCarrera(Carrera carrera)
        {
            listaCarreras.Remove(carrera);
        }
        
    }
}
