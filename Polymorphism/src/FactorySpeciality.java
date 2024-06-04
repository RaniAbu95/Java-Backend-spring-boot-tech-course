public enum FactorySpeciality
{
        Marketing(1),//->will call the CTOR
        production(2),
        operation(3),
        management(4);

        private int id;

        FactorySpeciality(int id) //CTOR
        {
            this.id = id;
        }

        static FactorySpeciality findById(int id)
        {
            for(FactorySpeciality firm : values())
            {
                if(firm.id == id)
                {
                    return firm;
                }
            }
            return null;
        }

        int getId()
        {
            return this.id;
        }


}
