package best.hyun.pgrc.type.keibee

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Keibee : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_keibee)
    override val type: PET_TYPE
        get() = PET_TYPE.KEIBEE
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_keibee)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 47
    override val initLvMaxAtk: Int
        get() = 10
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1288
    override val maxLvMaxAtk: Int
        get() = 292
    override val maxLvMaxDef: Int
        get() = 241
    override val maxLvMaxSpd: Int
        get() = 232
    override val initLvMinHp: Int
        get() = 35
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1071
    override val maxLvMinAtk: Int
        get() = 253
    override val maxLvMinDef: Int
        get() = 201
    override val maxLvMinSpd: Int
        get() = 200
    override val minAllGrowth: Double
        get() = 4.590
    override val maxAllGrowth: Double
        get() = 5.325
}