using GestionAvituallamiento.Logica;
using GestionAvituallamiento.modelo;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace GestionAvituallamiento
{
    /// <summary>
    /// Lógica de interacción para CrearAvituallamientos.xaml
    /// </summary>
    public partial class CrearAvituallamientos : Window
    {
        GestionApp gestionApp;

        public CrearAvituallamientos(GestionApp gestionApp)
        {
            InitializeComponent();
            this.gestionApp = gestionApp;
        }

        private void buttonAnnadirMaterial_Click(object sender, RoutedEventArgs e)
        {
            AnnadirMaterial annadirMaterial = new AnnadirMaterial();
            annadirMaterial.ShowDialog();
            String nombreCarrera = textBoxNombreCarrera.Text;
            long pk = long.Parse(textBoxPK.Text);
            String nombrePersona = textBoxNombrePersona.Text;
            String telf = textBoxTelefonoPersona.Text;

            gestionApp.annadirAvituallamiento(textBoxNombreCarrera.Text, long.Parse(textBoxPK.Text),
                textBoxNombrePersona.Text,int.Parse(textBoxTelefonoPersona.Text)
                , new MaterialDisponible("algo", 200,"algo"));

        }
    }
}
