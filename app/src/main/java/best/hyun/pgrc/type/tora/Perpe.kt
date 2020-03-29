package best.hyun.pgrc.type.tora

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Perpe : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_perpe)
    override val type: PET_TYPE
        get() = PET_TYPE.TORA
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_perpe)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
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
        get() = 61
    override val initLvMaxAtk: Int
        get() = 14
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1510
    override val maxLvMaxAtk: Int
        get() = 358
    override val maxLvMaxDef: Int
        get() = 197
    override val maxLvMaxSpd: Int
        get() = 189
    override val initLvMinHp: Int
        get() = 48
    override val initLvMinAtk: Int
        get() = 12
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1300
    override val maxLvMinAtk: Int
        get() = 319
    override val maxLvMinDef: Int
        get() = 159
    override val maxLvMinSpd: Int
        get() = 158
    override val minAllGrowth: Double
        get() = 4.446
    override val maxAllGrowth: Double
        get() = 5.153
}