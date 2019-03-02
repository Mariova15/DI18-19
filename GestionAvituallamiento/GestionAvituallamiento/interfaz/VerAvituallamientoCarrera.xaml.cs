using GestionAvituallamiento.logica;
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

namespace GestionAvituallamiento.interfaz
{
    /// <summary>
    /// Interaction logic for VerAvituallamientoCarrera.xaml
    /// </summary>
    public partial class VerAvituallamientoCarrera : Window
    {
        public GestionApp gestionApp { get; set; }
        public Carrera carrera { get; set; }

        public VerAvituallamientoCarrera(GestionApp gestionApp, Carrera carrera)
        {
            InitializeComponent();
            InitializeComponent();
            this.gestionApp = gestionApp;
            this.carrera = carrera;
            this.DataContext = this;
        }

        private void ButtonAnnadir_Click(object sender, RoutedEventArgs e)
        {
            CrearAvituallamiento crearAvituallamiento = new CrearAvituallamiento(gestionApp, carrera);
            crearAvituallamiento.Show();
        }

        private void ButtonBorrar_Click(object sender, RoutedEventArgs e)
        {
            if (DataGridAvituallamiento.SelectedIndex != -1)
            {
                carrera.listaAvituallamientos.Remove(DataGridAvituallamiento.SelectedItem as Avituallamiento);
            }
            else {
                MessageBox.Show("Selecciona un avituallamiento");
            }
        }

        private void ButtonEditar_Click(object sender, RoutedEventArgs e)
        {            
            if (DataGridAvituallamiento.SelectedIndex != -1)
            {
                CrearAvituallamiento crearAvituallamiento = new CrearAvituallamiento(
                gestionApp, carrera, DataGridAvituallamiento.SelectedIndex);
                crearAvituallamiento.Show();
            }
            else
            {
                MessageBox.Show("Selecciona un avituallamiento");
            }
        }

        private void ButtonAnnadirMaterialAvituallamiento_Click(object sender, RoutedEventArgs e)
        {           
            if (DataGridAvituallamiento.SelectedIndex != -1)
            {
                AnnadirMaterialAvituallamiento annadirMaterialAvituallamiento = new AnnadirMaterialAvituallamiento(
               gestionApp, DataGridAvituallamiento.SelectedItem as Avituallamiento);
                annadirMaterialAvituallamiento.Show();
            }
            else
            {
                MessageBox.Show("Selecciona un avituallamiento");
            }
        }

        private void ButtonVerMaterialesAvituallamiento_Click(object sender, RoutedEventArgs e)
        {            
            if (DataGridAvituallamiento.SelectedIndex != -1)
            {
                VerMaterialesAvituallamiento verMaterialesAvituallamiento = new VerMaterialesAvituallamiento(
                gestionApp, DataGridAvituallamiento.SelectedItem as Avituallamiento);
                verMaterialesAvituallamiento.Show();
            }
            else
            {
                MessageBox.Show("Selecciona un avituallamiento");
            }
        }
    }
}
