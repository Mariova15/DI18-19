using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.modelo
{
    public class Carrera : INotifyPropertyChanged, ICloneable, IDataErrorInfo
    {
        public ObservableCollection<Avituallamiento> listaAvituallamientos { get; set; }

        private String nombreCarrera;
        public String NombreCarrera
        {
            get
            {
                return nombreCarrera;
            }
            set
            {
                this.nombreCarrera = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("NombreCarrera"));
            }
        }

        private String lugarCarrera;
        public String LugarCarrera
        {
            get
            {
                return lugarCarrera;
            }
            set
            {
                this.lugarCarrera = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("LugarCarrera"));
            }
        }

        public event PropertyChangedEventHandler PropertyChanged;

        public Carrera() {
        listaAvituallamientos = new ObservableCollection<Avituallamiento>();
        }


        public object Clone()
        {
            return this.MemberwiseClone();
        }

        public string Error
        {
            get { return ""; }
        }

        public string this[string columnName]
        {
            get
            {
                string resultado = "";

                if (columnName == "NombreCarrera")
                {
                    if (string.IsNullOrEmpty(nombreCarrera))
                    {
                        resultado = "Nombre carrera vacío";
                    }
                }
                if (columnName == "LugarCarrera")
                {
                    if (string.IsNullOrEmpty(lugarCarrera))
                    {
                        resultado = "Lugar carrera vacío";
                    }
                }

                return resultado;
            }
        }
    }
}